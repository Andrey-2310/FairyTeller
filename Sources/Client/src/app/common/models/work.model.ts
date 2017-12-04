export class Work {
  id: number;
  views: number;
  rating: number;
  authorName: string;
  year: number;
  genres: string[];
  title: string;
  description: string;
  pagesAmount: number;
  coverImagePath: string;
  language: string;
}

export interface WorkList{
  works: Work[];
}
