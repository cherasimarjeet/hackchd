import { Component} from '@angular/core';
import { NavController } from 'ionic-angular';
import { PaymentPage } from '../payment/payment';
import { Platform} from 'ionic-angular';

@Component({
  templateUrl: 'challan-history.html'
})


export class challanHistoryPage {
    
     response: string;
    
  constructor(public navCtrl: NavController) {
    
      console.log("challan history",localStorage.getItem('challanHistory'));
        this.response =  JSON.parse(localStorage.getItem('challanHistory'));
      console.log("res",this.response);
  }
    
     
  goToPaymentPage() {
    //this.navCtrl.push(PaymentPage);
  }
  
}
