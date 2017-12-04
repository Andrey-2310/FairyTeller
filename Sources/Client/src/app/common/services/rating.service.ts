import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import 'rxjs/add/operator/map';
import {RatingDto} from "../models/rating.model";

@Injectable()
export class RatingService {

  constructor(private http: HttpClient) {
  }

  postRating(ratingDto: RatingDto ) {
    this.http.post('http://localhost:8080/rating/save', ratingDto)
      .subscribe();
  }
}
