import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-view-cart',
  templateUrl: './view-cart.component.html',
  styleUrls: ['./view-cart.component.css']
})
export class ViewCartComponent implements OnInit {
  productDetails;
  product;
  pro;
  constructor() { }

  ngOnInit() {
    this.viewProducts()
  }
viewProducts(){
  this.productDetails = localStorage.getItem('selectedProd');
  this.pro = JSON.parse(this.productDetails);


}
}
