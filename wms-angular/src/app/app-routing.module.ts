import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductListComponent } from './component/product-list/product-list.component';
import { PurchaseListComponent } from './component/purchase-list/purchase-list.component';

const routes: Routes = [
  // {path: 'products', component: ProductListComponent},
  // {path: '', redirectTo: 'products', pathMatch: 'full'},
  // {path: 'purchases', component: PurchaseListComponent},
  // {path: '', redirectTo: 'purchases', pathMatch: 'full'}
];

@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
