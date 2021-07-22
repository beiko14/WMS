import { Product } from "./product";

export class Order {
    id!: number;
    title!: string;
    firstName!: string;
    lastName!: string;
    numberShipped!: number;
    orderDate!: Date;
    product!: Product;
}
