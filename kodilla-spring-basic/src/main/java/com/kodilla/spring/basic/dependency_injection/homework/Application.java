package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        DeliveryServiceInterface deliveryServiceInterface = new DeliveryService();
        NotificationServiceInterface notificationServiceInterface = new NotificationService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryServiceInterface, notificationServiceInterface);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
    }
}