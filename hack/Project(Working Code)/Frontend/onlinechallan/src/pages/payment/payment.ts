import { Component } from '@angular/core';
import { App, MenuController} from 'ionic-angular';
import { NavController } from 'ionic-angular';
import { challanListingPage } from '../challan-listing/challan-listing';
import { Platform} from 'ionic-angular';

@Component({
  selector: 'page-payment',
  templateUrl: 'payment.html'
})

export class PaymentPage {
    
    aadhar: string;
    challan:string;

  constructor(public navCtrl: NavController) {
  }
    
    updateItem(item){
        if(item=='challan') {
            console.log("challan")
            this.challan = "";
            
        } else {
            console.log("aadhar");
            this.aadhar= "";
        }
    }
  
  isAndroid: boolean = false;
  goToChallanListing (){
    this.navCtrl.push(challanListingPage);
  }

}