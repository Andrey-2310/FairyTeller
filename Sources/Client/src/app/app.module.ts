import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule }   from '@angular/common/http';
import {Ng2CloudinaryModule} from 'ng2-cloudinary';
import {FileUploadModule} from 'ng2-file-upload';

import { AppComponent } from './app.component';
import { WorkListComponent } from './common/components/work-list/work-list.component';
import {WorkComponent} from "./common/components/work/work.component";
import {MainNavigationBarComponent} from "./common/components/main-navigation-bar/main-navigation-bar.component";
import {IntroductionComponent} from "./modules/startPage/introduction/introduction.component";

@NgModule({
  declarations: [
    AppComponent,
    WorkListComponent,
    WorkComponent,
    AppComponent,
    MainNavigationBarComponent,
    IntroductionComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    Ng2CloudinaryModule,
    FileUploadModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
