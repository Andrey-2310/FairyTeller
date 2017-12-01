import {Component, Input, OnInit, ViewEncapsulation} from '@angular/core';
import {Work} from "../../models/work.model";


@Component({
  selector: 'work-list',
  templateUrl: './work-list.component.html',
  styleUrls: ['../../../styles/work-list.component.css'],
  encapsulation: ViewEncapsulation.None
})
export class WorkListComponent implements OnInit {
  @Input() works: Work[];

  constructor() {
  }

  ngOnInit() {
  }

  showWorks = (): void => {
    console.log(this.works);
  }
}
