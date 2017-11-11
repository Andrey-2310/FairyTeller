import {Work} from './work.model'

export class Purchase {
  id: number;
  price: number;
  date: string;
  work: Work;
}

export interface PurchaseList{
  purchases: Purchase[];
}
