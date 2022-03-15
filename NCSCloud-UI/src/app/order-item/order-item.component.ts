import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BaseListCtl } from '../common/base-list.component';
import { ServiceLocatorService } from '../common/service/service-locator.service';

@Component({
  selector: 'app-order-item',
  templateUrl: './order-item.component.html',
  styleUrls: ['./order-item.component.css']
})
export class OrderItemComponent extends BaseListCtl {

  constructor(public locator: ServiceLocatorService, public route: ActivatedRoute) {
    
    super(locator.endpoints.ORDERITEM, locator, route);
 

  }
ngOnInit() {
  super.ngOnInit();
 // this.orderPreload();
  console.log("get order data================")
   // this.oService.getOrder();
}


populateForm(form, data) {
    
  form.id = data.id;
  form.productName = data.productName;
  form.modelNo = data.modelNo;
  form.gst = data.gst;
  form.payment_mode = data.payment_mode;
  form.billing_Address_Id=data.billing_Address_Id;
  form.shipping_Address_Id=data.shipping_Address_Id;
  form.image_id=data.image_id;
  form.order_id=data.order_id;
  form.price=data.price;
  form.total_price=data.total_price;
} 

// orderPreload() {
//   var _self = this;

//   _self.form.error = false;
//   _self.form.message = "";
// let url=_self.locator.endpoints.ORDERITEM;
//   this.locator.http.get(url+"/preload", (res, error) => {
    
//     if (error) {
//       return;
//     }

//     _self.form.error = !res.success;
//     _self.form.message = res.result.message;

//     if (res.success) {
//       _self.form.preload = res.result;
//     } 

//     console.log('FORM', _self.form);
//   });
// }



placeOrder(callback){
  console.log("inside placeOrder method--------------------------")
    var _self = this;

    _self.form.error = false;
    _self.form.message = "";
    _self.form.inputerror = {};
    let url= _self.locator.endpoints.ORDERITEM
    console.log("quantity--------------=== ******** "+this.form.data['quantity'])
    this.locator.http.post(url+"/placeOrder", this.form.data, function (res, error) {

      if (error) {
        return;
      }

      _self.form.error = !res.success;
      _self.form.message = res.result.message;

      if (res.success) {
        _self.form.message = "Data is saved";
        if (callback) {
          callback();
        }
      } else {
        _self.form.inputerror = res.result.inputerror;
      }
      console.log('FORM', _self.form);
    });
  }


}
