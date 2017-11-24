import {Chapter} from './chapter.model'

export class Work {
  id: number;
  authorName: string;
  title: string;
  chapters: Array<Chapter>;
}

export interface WorkList{
  purchases: Work[];
}
