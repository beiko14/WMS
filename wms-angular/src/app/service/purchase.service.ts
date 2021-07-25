import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Purchase } from '../model/purchase';

@Injectable({
  providedIn: 'root'
})
export class PurchaseService {

  private baseURL = "http://localhost:8080/api/purchases";

  constructor(private httpClient: HttpClient) { }

  getPurchasesList(): Observable<Purchase[]>{
    return this.httpClient.get<Purchase[]>(`${this.baseURL}`);
  }
}
