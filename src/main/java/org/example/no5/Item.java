package org.example.no5;

public class Item {
        private String item;
        private float price;
        private float percent;

        public Item() {
        }

        public Item(String item, float price, float percent) {
            this.item = item;
            this.price = price;
            this.percent = percent;
        }

        public String getItem() {
            return item;
        }

        public float getPrice() {
            return price;
        }

        public float getPercent() {
            return percent;
        }

        public void setItem(String item) {
            this.item = item;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public void setPercent(float percent) {
            this.percent = percent;
        }


}
