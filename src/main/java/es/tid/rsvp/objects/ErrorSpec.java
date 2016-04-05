package es.tid.rsvp.objects;

public abstract class ErrorSpec extends RSVPObject{


	public abstract void encodeHeader();

	public abstract void encode();

	public abstract void decodeHeader();

	public abstract void decode(byte[] bytes, int offset);

}