import {Component, Input} from '@angular/core';
import {Work} from "../../models/work.model";

@Component({
  selector: 'work',
  templateUrl: './work.component.html',
  styleUrls: ['../../../styles/work.component.less']
})
export class BookComponent {
  @Input() work: Work;

  showButtons: boolean;

  setShowButtons = (newShowButtons: boolean) => this.showButtons = newShowButtons;
  getShowButtons = () => this.showButtons;
}
