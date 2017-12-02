import {Chapter} from './chapter.model'

export class Work {
  id: number;
  views: number;
  authorId: number;
  title: string;
  description: string;
  coverImagePath: string;
}

export interface WorkList{
  works: Work[];
}
