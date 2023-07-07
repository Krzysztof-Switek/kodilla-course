package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {

    private DeliveryServiceInterface deliveryServiceInterface;
    private NotificationServiceInterface notificationServiceInterface;

    public ShippingCenter(DeliveryServiceInterface deliveryServiceInterface, NotificationServiceInterface notificationServiceInterface) {
        this.deliveryServiceInterface = deliveryServiceInterface;
        this.notificationServiceInterface = notificationServiceInterface;
    }

    public void sendPackage(String address, double weight) {
        if (deliveryServiceInterface.deliverPackage(address, weight)) {
            notificationServiceInterface.success(address);
        } else {
            notificationServiceInterface.fail(address);
        }
    }
}
