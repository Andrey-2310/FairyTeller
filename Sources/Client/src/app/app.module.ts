import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import { BarRatingModule } from "ngx-bar-rating";

import {Routes, RouterModule} from '@angular/router';

import {AppComponent} from './app.component';
import {WorkListComponent} from './common/components/work-list/work-list.component';
import {WorkComponent} from './common/components/work/work.component';
import {IntroductionComponent} from './modules/startPage/introduction/introduction.component';
import {WorkMainPageComponent} from './common/components/work-main-page/work-main-page.component';
import {BookAttributeComponent} from './common/components/work-main-page/work-attribute/work-attribute.component';
import {MainNavigationBarComponent} from "./common/components/main-navigation-bar/main-navigation-bar.component";
import {RatingComponent} from './common/components/rating/rating.component';

const appRoutes: Routes = [
  {path: '', redirectTo: '/intro', pathMatch: 'full'},
  {path: 'intro', component: IntroductionComponent},
  {path: 'workList', component: WorkListComponent},
  {path: 'workMainPage', component: WorkMainPageComponent},
  {path: '**', redirectTo: '/intro'}
];

@NgModule({
  declarations: [
    AppComponent,
    WorkListComponent,
    WorkComponent,
    AppComponent,
    MainNavigationBarComponent,
    IntroductionComponent,
    BookAttributeComponent,
    WorkMainPageComponent,
    RatingComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BarRatingModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
