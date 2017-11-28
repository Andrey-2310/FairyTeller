import {Component, OnInit} from '@angular/core';
import {PurchaseService} from "./common/services/purchase.service";
import {Purchase, PurchaseList} from "./common/models/purchase.model";
import {Observable} from "rxjs/Observable";
import {Work, WorkList} from "./common/models/work.model";
import {WorkService} from "./common/services/work.service";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [PurchaseService, WorkService]
})
export class AppComponent implements OnInit{
  constructor(private purchaseService: PurchaseService, private workService: WorkService) {
  }

  works: WorkList;
  purchases: PurchaseList;
  title = 'app';

  getUserPurchases = (): void => {
    this.purchaseService.getPurchasesByUserId(1).subscribe(data => this.purchases = data);
  };

  getPopularWorks = (): void => {
   this.workService.getNextPopularWorks().subscribe(data => {
     this.works = data;
   });
  };

  ngOnInit() {
    this.getPopularWorks();
  }

}

