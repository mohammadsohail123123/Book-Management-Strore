export class bookBean{
   
    sku : string;
    name : string;
    description : string;
    unitPrice : number;
    imageUrl : string;
    active : boolean;
    unitsInStock : number;
    createdOn : Date;
    updatedOn  :Date;
    categoryId  :number;
  
constructor(sku: string,name: string,description: string,unitPrice: number,imageUrl: string,active: boolean,unitsInStock: number,createdOn: Date,updatedOn:Date,categoryId:number){
this.sku=sku;
this.name=name;
this.description=description;
this.unitPrice=unitPrice;
this.imageUrl=imageUrl;
this.active=active;
this.unitsInStock=unitsInStock;
this.createdOn=createdOn;
this.updatedOn=updatedOn;
this.categoryId=categoryId;
}
    
}