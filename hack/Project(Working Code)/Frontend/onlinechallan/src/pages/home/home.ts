import { Component } from '@angular/core';

import { NavController } from 'ionic-angular';
import { ContactPage } from '../contact/contact';
import { Http } from '@angular/http';
import { HelloIonicPage } from '../hello-ionic/hello-ionic';
import { contentHeaders } from '../hello-ionic/headers';

@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {
    
     response: string;
    username : string;
    highest_scorer : string;
    department_total_year : string;
    current_Location : string;
    base_location : string;
    challan_count_total : string;
    challan_count_year:string;
    designation:string;

  constructor(public http: Http, public navCtrl: NavController) {
      
      let body = localStorage.getItem('body');
      
        // this.http.post('http://jsonstub.com/authentication', body,{ headers: contentHeaders })
        this.http.post('http://10.11.225.18:9095/authentication', body,{ headers: contentHeaders })
            .subscribe(
                response => {
                    
                    
                    this.response = response.text();
                    this.username = response.json().user.username;
                    this.highest_scorer = response.json().highest_scorer;
                    this.department_total_year = response.json().department_total_year;
                    this.current_Location = response.json().current_Location;
                    this.base_location = response.json().user.base_location;
                    this.challan_count_total = response.json().user.challan_count_total;
                    this.challan_count_year = response.json().user.challan_count_year;
                    this.designation = response.json().user.designation;
                    
                    console.log("Response Data after login",response.json());    
                
                
                    if(response.status==200){
                        if(response.json().user) {
                            
                        //    this.navCtrl.push(HomePage);     
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
  
  goToContactPage() {
    this.navCtrl.push(ContactPage);
  }
   

}
