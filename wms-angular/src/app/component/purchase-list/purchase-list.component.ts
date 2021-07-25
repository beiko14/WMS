import { Component, OnInit } from '@angular/core';
import { Purchase } from 'src/app/model/purchase';
import { PurchaseService } from 'src/app/service/purchase.service';

@Component({
  selector: 'app-purchase-list',
  templateUrl: './purchase-list.component.html',
  styleUrls: ['./purchase-list.component.css']
})
export class PurchaseListComponent implements OnInit {

  purchases!: Purchase[];

  constructor(private purchaseService: PurchaseService) { }

  ngOnInit(): void {
    this.getPurchases();
  }

  private getPurchases(){
    this.purchaseService.getPurchasesList().subscribe(data => {
      this.purchases = data;
    })
  }

}
