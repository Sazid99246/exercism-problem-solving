#include "reverse_string.h"
#include <algorithm>
#include <utility>
namespace reverse_string {
    std::string reverse_string(const std::string&& input) {
        std::string output;
        std::reverse_copy(input.cbegin(), input.cend(), std::back_inserter(output));
        return output;
    }
}  // namespace reverse_string
