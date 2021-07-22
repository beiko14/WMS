import { Product } from "./product";
import { Supplier } from "./supplier";

export class Purchase {
    id!: number;
    numberReceived!: number;
    purchaseDate!: Date;
    product!: Product;
    supplier!: Supplier;
}
