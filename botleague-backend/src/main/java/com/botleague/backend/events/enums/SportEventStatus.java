package com.botleague.backend.events.enums;

public enum SportEventStatus {
    DRAFT,
    PENDING_APPROVAL,   // submitted to admin; awaiting review
    APPROVED,           // admin approved; organiser may open registration
    REGISTRATION_OPEN,
    REGISTRATION_CLOSED
}
