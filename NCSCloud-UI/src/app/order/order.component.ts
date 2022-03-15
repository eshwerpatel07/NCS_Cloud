import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BaseListCtl } from '../common/base-list.component';
import { BaseCtl } from '../common/base.component';

import { ServiceLocatorService } from '../common/service/service-locator.service';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent extends BaseListCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    
    super(locator.endpoints.ORDER, locator, route);
 

  }
ngOnInit() {
  super.ngOnInit();
  console.log("get order data================")
   // this.oService.getOrder();
}
 

populateForm(form, data) {
    
  form.id = data.id;
  form.orderId = data.orderId;
  form.total_price = data.total_price;
  form.no_of_items = data.price;
  form.quantity=data.quantity;
  form.discount = data.discount;
  form.description=data.description;
  form.shipping_Address_Id=data.shipping_Address_Id;
  form.billing_Address_Id=data.billing_Address_Id;
  
  
} 

    }

