/*package MMT;
@RestController
@RequestMapping(value = "/library", produces = {"application/json"})
public class LibraryWS {
	
	LibraryWS()
	{
		LibraryService libraryService=new LibraryService();
	}
	
	
	@RequestMapping(value = "/createAccount", method = "POST", consumes = {"application/json"})
    public ResponseEntity getLibrary(
            @RequestBody LibraryParameters getLibrary, @RequestHeader HttpHeaders headers) {
        LibraryResponse libraryResponse = libraryService.createAccount(getLibrary.get);
        return new ResponseEntity(libraryResponse, HttpStatus.valueOf((!libraryResponse.getCode().equals("SUCCESS")) ? "CONFLICT" : "OK"));
    }

}
*/