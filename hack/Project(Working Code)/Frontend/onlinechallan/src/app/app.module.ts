import { NgModule } from '@angular/core';
import { IonicApp, IonicModule } from 'ionic-angular';
import { MyApp } from './app.component';
import { AboutPage } from '../pages/about/about';
import { ContactPage } from '../pages/contact/contact';
import { HomePage } from '../pages/home/home';
import { TabsPage } from '../pages/tabs/tabs';
import { HelloIonicPage } from '../pages/hello-ionic/hello-ionic';
import { PaymentPage } from '../pages/payment/payment';
import { challanListingPage } from '../pages/challan-listing/challan-listing';
import { challanHistoryPage } from '../pages/challan-history/challan-history';

@NgModule({
  declarations: [
    MyApp,
    AboutPage,
    ContactPage,
    HomePage,
    TabsPage,
    HelloIonicPage,
    PaymentPage,
    challanListingPage,
      challanHistoryPage
  ],
  imports: [
    IonicModule.forRoot(MyApp)
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    AboutPage,
    ContactPage,
    HomePage,
    TabsPage,
    HelloIonicPage,
    PaymentPage,
    challanListingPage,
      challanHistoryPage
  ],
  providers: []
})
export class AppModule {}
