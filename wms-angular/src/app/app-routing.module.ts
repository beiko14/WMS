import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CreateProductComponent } from './component/create-product/create-product.component';
import { OrderListComponent } from './component/order-list/order-list.component';
import { ProductListComponent } from './component/product-list/product-list.component';
import { PurchaseListComponent } from './component/purchase-list/purchase-list.component';

const routes: Routes = [
  {path: 'products', component: ProductListComponent},
  {path: '', redirectTo: 'products', pathMatch: 'full'},
  {path: 'create-product', component: CreateProductComponent},
  {path: 'purchases', component: PurchaseListComponent},
  {path: '', redirectTo: 'purchases', pathMatch: 'full'},
  {path: 'orders', component: OrderListComponent},
  {path: '', redirectTo: 'orders', pathMatch: 'full'},
  // {path: 'reports', component: ReportListComponent},
  // {path: '', redirectTo: 'reports', pathMatch: 'full'}
];

@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
