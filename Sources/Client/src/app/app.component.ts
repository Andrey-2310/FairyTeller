import {Component} from '@angular/core';
import {PurchaseService} from "./common/services/purchase.service";
import {PurchaseList} from "./common/models/purchase.model";


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

  getUserPurchases = (): void => {
    this.purchaseService.getPurchasesByUserId(1).subscribe(data => this.purchases= data);
  }
}

