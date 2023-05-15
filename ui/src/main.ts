import {enableProdMode} from '@angular/core';
import {platformBrowserDynamic} from '@angular/platform-browser-dynamic';
import {AppModule} from './app/app.module';
import {environment} from './environments/environment';

if (environment.production) {
  enableProdMode();
}

platformBrowserDynamic()
    .bootstrapModule(AppModule)
    .catch((err) => console.log(err));

// Core prototype extensions
String.prototype.includes = function(this: string, str: string) {
  return this.toLowerCase().indexOf(str.toLowerCase()) >= 0;
};
