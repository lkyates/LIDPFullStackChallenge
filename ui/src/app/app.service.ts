import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {environment} from '../environments/environment';

@Injectable()
export class AppService {
  constructor(private http: HttpClient) {}

  getPosts(): Observable<any> {
    return this.http.get(`${environment.server}/posts`);
  }
}
