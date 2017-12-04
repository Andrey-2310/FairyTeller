import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';

@Component({
  selector: 'workRating',
  templateUrl: './rating.component.html',
  styleUrls: ['../../../styles/rating.component.less']
})
export class RatingComponent implements OnInit {
  @Input() averageValue: number;
  @Input() userValue: number;

  valueToShow: number;

  readonly masStarsAmount: number = 5;
  readonly ratingTheme: string = 'fontawesome';

  constructor() {
  }

  ngOnInit() {
    this.valueToShow = this.averageValue;
  }

  setRating = (): void => {
    this.userValue = this.valueToShow;
    this.change(this.userValue);
  };

  isVoted = (): boolean => !!this.userValue;

  @Output() onUserValueChanged = new EventEmitter<number>();

  change(newValue: number) {
    this.onUserValueChanged.emit(newValue);
  }

}
