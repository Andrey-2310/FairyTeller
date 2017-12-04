import {AfterContentInit, Component, Input, OnInit, ViewEncapsulation} from '@angular/core';
import {Work} from "../../models/work.model";
import {RatingService} from "../../services/rating.service";
import {RatingDto} from "../../models/rating.model";

@Component({
  selector: 'work-main-page',
  templateUrl: './work-main-page.component.html',
  styleUrls: ['../../../styles/work-main-page.component.less'],
  providers:[RatingService]
})
export class WorkMainPageComponent implements OnInit, AfterContentInit {

  //@Input() work: Work;
  work: Work;
  workAttributesValues: any[];
  workAttributesNames: string[] = [ 'Year', 'Genres', 'Pages', 'Language'];
  rating: number = 4;

  constructor(private ratingService: RatingService) {
    this.work = new Work();
  }

  ngOnInit() {
    this.work.authorName = 'Vitalik Redkovsky';
    this.work.year = 1980;
    this.work.pagesAmount = 345;
    this.work.id = 1;
  }

  ngAfterContentInit(): void {
    this.workAttributesValues = [
      this.work.year,
      this.work.genres,
      this.work.pagesAmount,
      this.work.language
      ];
  }

  showStars = (): void => {
    console.log(this.rating);
  };

  setNewRating(newRating: number){
    console.log(newRating);
    this.ratingService.postRating(new RatingDto(0, this.work.id, 1, newRating))
  }
}
