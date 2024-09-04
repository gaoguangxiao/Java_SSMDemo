use itheima;

insert into tb_brand (brand_name,componey_name,ordered,decription,status) 
values ('三只松鼠','三只松鼠股份有限公司',5,'好吃不上火',1),
('华为','华为技术有限公司',100,'华为手机',0),
('小米','小米科技有限公司',90,'小米手机',1);

insert into tb_brand (brand_name,componey_name,ordered,decription,status)
        values ('波导手机','波导手机公司',10000,'手机战斗机',1);
        
SELECT * FROM itheima.tb_brand;