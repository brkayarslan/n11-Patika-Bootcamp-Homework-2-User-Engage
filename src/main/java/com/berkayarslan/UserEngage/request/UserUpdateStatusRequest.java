package com.berkayarslan.UserEngage.request;

import com.berkayarslan.UserEngage.model.Status;

public record UserUpdateStatusRequest(Long id, Status status) {
}
