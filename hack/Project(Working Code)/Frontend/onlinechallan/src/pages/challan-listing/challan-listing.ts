import { Component} from '@angular/core';
import { NavController } from 'ionic-angular';
import { PaymentPage } from '../payment/payment';
import { Platform} from 'ionic-angular';

@Component({
  templateUrl: 'challan-listing.html'
})


export class challanListingPage {
  constructor(public navCtrl: NavController) {
    
    
  }
  goToPaymentPage() {
    //this.navCtrl.push(PaymentPage);
  }
  
}
