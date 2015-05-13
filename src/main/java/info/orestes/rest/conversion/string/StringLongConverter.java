package info.orestes.rest.conversion.string;

import info.orestes.rest.conversion.Accept;
import info.orestes.rest.conversion.Context;
import info.orestes.rest.conversion.Converter;
import info.orestes.rest.conversion.MediaType;

@Accept(MediaType.TEXT_ALL)
public class StringLongConverter extends Converter<Long, String> {
	
	@Override
	public String toFormat(Context context, Long source, Class<?>[] genericParams) {
		return source.toString();
	}
	
	@Override
	public Long toObject(Context context, String source, Class<?>[] genericParams) {
		return Long.valueOf(source);
	}
}
