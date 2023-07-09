import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AdmindeskComponent } from './admindesk.component';

describe('AdmindeskComponent', () => {
  let component: AdmindeskComponent;
  let fixture: ComponentFixture<AdmindeskComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AdmindeskComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AdmindeskComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
