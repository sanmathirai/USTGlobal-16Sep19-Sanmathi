import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parentmobiles',
  templateUrl: './parentmobiles.component.html',
  styleUrls: ['./parentmobiles.component.css']
})
export class ParentmobilesComponent implements OnInit {
  selectedMobile = '';
  Mobiles = [
  {
    imageUrl : 'https://cdn.pixabay.com/photo/2016/11/10/16/18/android-1814600__340.jpg',
    name : 'Asus Zenfone 5',
    price : 'Price : 1945',
    // tslint:disable-next-line: max-line-length
    description : 'ASUS Mobile X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz SDRAM, 1 x SO-DIMM socket , up to 8 GB SDRAM. Display. 14.0" (16:9) LED-backlit HD (1366x768) 60Hz Anti-Glare Panel with 45% NTSC. Graphic Storage.'


  },
  {
    imageUrl : 'https://cdn.pixabay.com/photo/2017/01/06/13/50/smartphone-1957740__340.jpg',
    name : 'Samsung galaxy s5',
    price : 'Rs : 35999',
    // tslint:disable-next-line: max-line-length
    description : 'Samsung Galaxy With Alexa In-built. Freedom To Do More w/ Power Of Your Voice. Shop Now! Accidental Protection. Protegent Antivirus. Additional Warranty. Theft Insurance. Models: HP Pavilion x360 14, HP Gaming Pavilion - 15, OMEN by HP 15, HP Notebook - 15.'
  },
  {
    imageUrl : 'https://cdn.pixabay.com/photo/2016/12/09/11/33/smartphone-1894723__340.jpg',
    name : 'Iphone 5',
    price : 'Rs : 41999',
    // tslint:disable-next-line: max-line-length
    description : 'Iphone 5 Crafted From Brushed Aluminium. Laptop W/ Intel Core. Shop Today! Sennheiser Headset @ 299. Get 3Yr Premium Support. Cash off on MS Office. Get Warranty Worth@₹3999. Amenities: Dell Power Companion, Dell Bluetooth Mouse.'
  },
  {
    imageUrl : 'https://cdn.pixabay.com/photo/2013/07/12/18/39/smartphone-153650__340.png',
    name : 'IPhone 4',
    price : 'Rs : 24999',
    // tslint:disable-next-line: max-line-length
    description : '2.4GHz 8-core Intel Core i9, Turbo Boost up to 5.0GHz, with 16MB shared L3 cache. 32GB of 2400MHz DDR4 memory. Radeon Pro 560X with 4GB of GDDR5 memory. 2.4GHz 8-core Intel Core i9, Turbo Boost up to 5.0GHz, with 16MB shared L3 cache. 32GB of 2400MHz DDR4 memory. Radeon Pro 560X with 4GB of GDDR5 memory.'
  },



  ];
    constructor() { }

    ngOnInit() {
    }
    sendMobile(mobile) {
      console.log(mobile);
      this.selectedMobile = mobile;
    }

}
