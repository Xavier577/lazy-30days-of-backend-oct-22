package day4

import (
	"regexp"
)

type ValidationResponse struct {
	Email    bool
	Password bool
}

func isPasswordLongEnough(password string, optimumLen int) bool {
	return len(password) >= optimumLen
}

func validatePass(password string) bool {

	passwordLongEnough := isPasswordLongEnough(password, 8)

	containsUpperCase := regexp.MustCompile("[A-Z]").MatchString(password)

	containsLowerCase := regexp.MustCompile("[a-z]").MatchString(password)

	containsNumber := regexp.MustCompile(`\d`).MatchString(password)

	containsSpecialCharacters := regexp.MustCompile("[^Aa-zZ0-9]").MatchString(password)

	return passwordLongEnough && containsUpperCase && containsLowerCase && containsNumber && containsSpecialCharacters

}

func ValidateCredentails(email, password string) *ValidationResponse {
	emailRegexPattern := "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$"

	validationResponse := new(ValidationResponse)

	if match, err := regexp.MatchString(emailRegexPattern, email); err == nil && match {
		validationResponse.Email = true
	}

	if isPasswordValid := validatePass(password); isPasswordValid {
		validationResponse.Password = true
	}

	return validationResponse
}
