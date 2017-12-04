import {Component, Input, OnInit, ViewEncapsulation} from '@angular/core';

@Component({
  selector: 'book-attribute',
  templateUrl: './work-attribute.component.html',
  styleUrls: ['../../../../styles/work-attribute.component.less'],
  encapsulation: ViewEncapsulation.None
})
export class BookAttributeComponent implements OnInit {
  @Input() attributeValue: string;
  @Input() attributeName: string;
  constructor() { }

  ngOnInit() {
  }

}
