import {Component, OnDestroy, OnInit} from '@angular/core';
import {AppService} from './app.service';
import {Post} from './domain/Post';
import {Subscription} from 'rxjs/dist/types';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit, OnDestroy {
  private subscriptions: Subscription[] = [];

  posts: Array<Post>;

  constructor(private appService: AppService) {
  }

  ngOnInit(): void {
    this.subscriptions.push(
      this.appService.getPosts().subscribe(
        posts => this.posts = posts
      )
    );
  }

  ngOnDestroy(): void {
    this.subscriptions.forEach((subscription) => subscription.unsubscribe());
  }

  hideImage(event: Event): void {
    (event.target as HTMLImageElement).style.display = 'none';
  }
}
