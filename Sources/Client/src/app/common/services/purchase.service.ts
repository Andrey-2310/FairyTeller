import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs/Observable';
import {PurchaseList} from '../models/purchase.model';
import 'rxjs/add/operator/map';

@Injectable()
export class PurchaseService {

  constructor(private http: HttpClient){}

  getPurchasesByUserId(id: number): Observable<PurchaseList> {
    return this.http.get<PurchaseList>('http://localhost:8080//purchaseListByUserId/'+ id)
  }
}


