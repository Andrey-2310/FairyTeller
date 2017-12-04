export class RatingDto {

  constructor(private id: number,
              private workId: number,
              private userId: number,
              private value: number) {
  }
}

export interface RatingList {
  ratings: RatingDto[];
}
