import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Order } from '../model/order';

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  private baseURL = "http://localhost:8080/api/orders";

  constructor(private httpClient: HttpClient) { }

  getOrdersList(): Observable<Order[]>{
    return this.httpClient.get<Order[]>(`${this.baseURL}`);
  }
}
