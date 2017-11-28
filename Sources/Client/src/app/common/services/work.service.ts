import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs/Observable';
import 'rxjs/add/operator/map';
import {WorkList} from "../models/work.model";

@Injectable()
export class WorkService {

  constructor(private http: HttpClient) {
  }

  getWorksByUserId(id: number): Observable<WorkList> {
    return this.http.get<WorkList>('http://localhost:8080//worksByAuthorId/' + id)
  }

  getNextPopularWorks(from?: number): Observable<WorkList> {
    return this.http.get<WorkList>('http://localhost:8080//nextPopularWorks/' + (from ? from : -1))
  }
}
