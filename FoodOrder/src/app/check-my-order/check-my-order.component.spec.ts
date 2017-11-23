import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CheckMyOrderComponent } from './check-my-order.component';

describe('CheckMyOrderComponent', () => {
  let component: CheckMyOrderComponent;
  let fixture: ComponentFixture<CheckMyOrderComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CheckMyOrderComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CheckMyOrderComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
