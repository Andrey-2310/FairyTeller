import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule }   from '@angular/common/http';
import {MainNavigationBarComponent} from "./common/components/main-navigation-bar/main-navigation-bar.component";

import { AppComponent } from './app.component';
import {IntroductionComponent} from "./modules/startPage/introduction/introduction.component";

@NgModule({
  declarations: [
    AppComponent,
    MainNavigationBarComponent,
    IntroductionComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
