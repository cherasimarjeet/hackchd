import { Component} from '@angular/core';
import { Http } from '@angular/http';
import { App, MenuController} from 'ionic-angular';
import { NavController } from 'ionic-angular';
import { AboutPage } from '../about/about';
import { HomePage } from '../home/home';
import { PaymentPage } from '../payment/payment';
import { Platform} from 'ionic-angular';
import { challanListingPage } from '../challan-listing/challan-listing';
import { contentHeaders } from './headers';


@Component({
  templateUrl: 'hello-ionic.html'
})


export class HelloIonicPage {
  constructor(app: App, menu: MenuController, public navCtrl: NavController, platform: Platform, public http: Http) {
    menu.enable(true);
    
   
    
    
  }
    
     login(event, username, password) {
        event.preventDefault();
        let body = JSON.stringify({ username, password });
        console.log("body",body);
        // this.http.post('http://jsonstub.com/authentication', body,{ headers: contentHeaders })
        this.http.post('http://10.11.225.18:9095/authentication', body,{ headers: contentHeaders })
            .subscribe(
                response => {
            
                console.log("Response Data",response.json());    
                console.log("Response Data Status",response.status);
                
                    if(response.status==200){
                        if(response.json().user) {
                            
                            localStorage.setItem('body',body);
                            this.navCtrl.push(HomePage);     
                        }
                    } else if(response.status==500) {
                        alert("fsdfsdfsdf");
                    }
        
        },
        error => {
          //alert(error.text());
          //console.log(error.text());
        });
  }
  
  
  isAndroid: boolean = false;
  
  goToAboutPage() {
    this.navCtrl.push(AboutPage);
  }
   
 
  
  goToPaymentPage() {
    this.navCtrl.push(PaymentPage);
  }
  
}
