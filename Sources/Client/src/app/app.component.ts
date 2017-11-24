import {Component} from '@angular/core';
import {PurchaseService} from "./common/services/purchase.service";
import {Purchase, PurchaseList} from "./common/models/purchase.model";
import {Observable} from "rxjs/Observable";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [PurchaseService]
})
export class AppComponent {
  constructor(private purchaseService: PurchaseService) {
  }

  purchases: PurchaseList;
  title = 'app';

  getUserPurchases = (): void => {
    this.purchaseService.getPurchasesByUserId(1).subscribe(data => this.purchases= data);
  }
}

