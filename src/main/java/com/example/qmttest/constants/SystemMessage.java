package com.example.qmttest.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * This class stores a collection of constants for error messages and validation messages used in the application.
 * It provides a clear and centralized way to access and manage these messages throughout the codebase.
 */
@Getter
@RequiredArgsConstructor
public enum SystemMessage {
    //region Common
    SUCCESS(200, "SUCCESS"),
    BAD_REQUEST(400, "BAD_REQUEST"),
    INTERNAL_SERVER(500, "INTERNAL_SERVER"),
    UNEXPECTED_VALUE(400, "UNEXPECTED_VALUE"),
    //endregion

    //region User
    USER_NOT_FOUND(1000, "User not found"),
    YOUR_ACCOUNT_IS_DISABLED(1001, "Your account is disabled"),
    YOUR_SESSION_DOES_NOT_EXIST(1002, "Your session does not exist"),
    SESSION_NOT_SAME(1003, "Your session has expired"),
    EMAIL_ALREADY_EXISTS(1004, "Email already exists"),
    CURRENT_PASSWORD_INVALID(1005, "Current password invalid"),
    USER_CHARACTER_NOT_FOUND(1006, "User character not found"),
    SESSION_NOT_FOUND(1007, "Your session not found"),
    IS_FIRST_LOGIN(1010, "Is first login"),
    IS_NOT_FIRST_LOGIN(1011, "Is not first login"),
    CREATE_A_NEW_ACCOUNT_AND_SEND_MAIL(1012, "Create a new account and send mail"),
    EMAIL_DOES_NOT_EXISTS(1004, "Email does not exist"),
    //endregion

    //region Room
    ROOM_NOT_FOUND(2000, "Room not found"),
    ROOM_IS_NOT_A_MEETING_ROOM(2_001, "This room is not a meeting room"),
    ROOM_HAS_BEEN_BANNED(2_002, "This room has been banned"),
    YOU_DO_NOT_HAVE_PERMISSION(2_005, "You do not have permission to access this room"),
    ROOM_IS_NOT_AVAILABLE(2_010, "Room is not available"),
    USER_DID_NOT_JOIN_ROOM(2_020, "The user did not join the room"),
    //endregion

    //region Room booking
    ROOM_HAS_BEEN_RESERVED(3_000, "This room has been reserved"),
    ROOM_BOOKING_NOT_FOUND(3_001, "Room booking not found"),
    CANNOT_DELETE_ROOM_BOOKING(3_002, "Cannot delete the room booking, if its status is not UPCOMING"),
    //endregion

    //region event
    YOUR_ARE_NOT_THE_HOST_OF_EVENT(4_000, "You are not the host of this event"),
    CANNOT_UPDATE_EVENT_INFORMATION(4_001, "Cannot update the event information, if its status is neither UPCOMING nor IN_PROGRESS"),
    CANNOT_UPDATE_EVENT_IS_NOT_UPCOMING(4_002, "Cannot update the event information, if its status is not UPCOMING"),
    CANNOT_UPDATE_EVENT_IS_NOT_IN_PROGRESS(4_003, "Cannot update the event information, if its status is not IN_PROGRESS"),
    EVENT_NOT_FOUND(4_010, "Event not found"),
    EVENT_IS_NOT_IN_PROGRESS(4_020, "You cannot join the room because this event is not IN_PROGRESS status"),
    CANNOT_CHANGE_LIVE_STREAM_URL(4_021, "You cannot change the live stream url of the room because this event is not IN_PROGRESS status"),
    OUT_OF_SLOTS_TO_JOIN_EVENT(4_030, "Out of slots to join the event"),
    //endregion

    //region File
    ATTACHMENT_CANNOT_BE_NULL(5000, "Attachment cannot be null"),
    //endregion

    //region User registration
    USER_REGISTRATION_NOT_FOUND(6000, "User code not found"),
    //endregion

    //region Master model
    MASTER_MODEL_NOT_FOUND(7000, "Master code not found"),
    //endregion

    //region User registration
    OFFICE_REGIS_NOT_FOUND(8000, "Office not found"),
    //endregion

    //region Office
    OFFICE_NOT_FOUND(8_500, "Office not found"),
    OFFICE_DOMAIN_ALREADY_EXISTS(8_501, "Domain already exists"),
    //endregion

    //region Organization
    ORGANIZATION_NOT_FOUND(9000, "Organization not found"),
    USER_ORGANIZATION_NOT_FOUND(9001, "This user does not exist in the org"),
    USER_HAS_EXPIRED(9_002, "User had expired"),
    YOU_ARE_NOT_OWNER_OF_ORG(9_003, "You are not the owner of this organization"),
    EMAIL_ALREADY_EXISTS_IN_ORG(9_004, "Email already exists in the organization"),
    //endregion

    //region Token
    TOKEN_NOT_FOUND(10_000, "Token not found"),
    TOKEN_HAS_EXPIRED(10_001, "Token had expired"),
    //endregion

    //region live stream
    UNABLE_TO_RETRIEVE_STREAM(11_000, "Unable to display the livestream. Please make sure that the channel is live right now."),
    TWITCH_CHANNEL_DOES_NOT_EXIST(11_010, "This Twitch channel does not exist"),
    //endregion

    //region photon
    PHOTON_AUTHENTICATION_FAILED(12_000, "Authentication failed. Please check your log in information and try again")
    //endregion
    ;

    private final int code;
    private final String message;
}

