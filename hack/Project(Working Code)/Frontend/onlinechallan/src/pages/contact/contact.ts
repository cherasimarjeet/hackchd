import { Component, Input } from '@angular/core';
import { NavController } from 'ionic-angular';
import { ToastController } from 'ionic-angular';
import { HomePage } from '../home/home';
import { contentHeaders } from '../hello-ionic/headers';
import { challanHistoryPage } from '../challan-history/challan-history';
import { Http } from '@angular/http';

@Component({
  selector: 'page-contact',
  templateUrl: 'contact.html'
})
export class ContactPage {

  constructor(public navCtrl: NavController,public toastCtrl: ToastController,public http: Http) {
     
  }
    
    showToastWithCloseButton(position: string) {
        const toast = this.toastCtrl.create({
          message: 'Challan has been Issued. Notification has been sent to violators email id/number.',
          showCloseButton: true,
          closeButtonText: 'Ok',
          position: position
        });
        
         toast.onDidDismiss(() => {
            console.log('Dismissed toast');
              this.navCtrl.push(HomePage);
          });
        
        toast.present();
      }
  
  
 todo = {};
  logForm(event,username,mobile,aadhar,issuedate,place,reg_no,email_id,father_name,local_address,address,rules_violated) {
        event.preventDefault();
      
      let test = {}
      
     /* for(var i in rules_violated) {
          test.append(rules_violated[i]);
          console.log("i",rules_violated[i]);
      }*/
      
      let body =  {
        "aadhar_no": aadhar,
        "date": issuedate,
        "driving_license_no": "CHD_56464",
        "lattitude": "30.7333",
        "longitute": "76.7794",
        "place": place,
        "reg_no": reg_no,
        "rules_violated": "Violating the Stop Line.,Signal Jumping.",
        "violatorDetails": {
            "aadhar_no": aadhar,
            "address": address,
            "email_id": email_id,
            "father_name": father_name,
            "local_address": local_address,
            "phone_no": mobile,
            "username": username
            
        }
      }
      
      console.log('body',body);
      
      this.http.post('http://10.11.225.18:9095/challan', body,{ headers: contentHeaders })
            .subscribe(
                response => {
                    
                    console.log("Response Data after challan submit",response.json());    
                    localStorage.setItem('challanHistory',JSON.stringify(response.json()));
                    this.navCtrl.push(challanHistoryPage);
                    
        
        },
        error => {
          //alert(error.text());
          //console.log(error.text());
        });
      
    //console.log('Submit',username,mobile,aadhar,issuedate,place,reg_no,email_id,father_name,local_address,address,rules_violated);
      //this.showToastWithCloseButton('center');
      
      
      
  }
  
   inputs = [];
   
   addInput() {
    this.inputs.push({value: 'Textfield'});
  }
  
}
