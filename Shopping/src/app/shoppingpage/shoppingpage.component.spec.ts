import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShoppingpageComponent } from './shoppingpage.component';

describe('ShoppingpageComponent', () => {
  let component: ShoppingpageComponent;
  let fixture: ComponentFixture<ShoppingpageComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ShoppingpageComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ShoppingpageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
